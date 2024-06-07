import jenkins.model.Jenkins
import com.cloudbees.plugins.credentials.domains.Domain
import com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl
import com.cloudbees.plugins.credentials.CredentialsScope
import java.util.Properties
import java.io.File


def props = new Properties()
def envFile = new File('/etc/jenkins.env')
if (envFile.exists()) {
    props.load(envFile.newDataInputStream())
} else {
    throw new RuntimeException("/etc/jenkins.env file not found")
}

// Parameters
def dockerhubUsername = props.getProperty('DOCKERHUB_USERNAME')
def dockerhubPassword = props.getProperty('DOCKERHUB_CREDS')

// Get the Jenkins instance
def jenkinsInstance = Jenkins.getInstance()

// Define the domain (GLOBAL)
def domain = Domain.global()

// Create DockerHub credentials
def dockerhubCredentials = new UsernamePasswordCredentialsImpl(
    CredentialsScope.GLOBAL,
    "dockerhub_credentials",
    "DockerHub token for Jenkins",
    dockerhubUsername,
    dockerhubPassword
)

// Add the credentials to the global domain
def credentialsStore = jenkinsInstance.getExtensionList('com.cloudbees.plugins.credentials.SystemCredentialsProvider')[0].getStore()
credentialsStore.addCredentials(domain, dockerhubCredentials)

println "DockerHub credentials added successfully with ID: dockerhub_credentials"
