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
def githubUsername = props.getProperty('GH_USERNAME')
def githubPassword = props.getProperty('GH_CREDS')

// Get the Jenkins instance
def jenkinsInstance = Jenkins.getInstance()

// Define the domain (GLOBAL)
def domain = Domain.global()

// Create GitHub credentials
def githubCredentials = new UsernamePasswordCredentialsImpl(
    CredentialsScope.GLOBAL,
    "github_token",
    "Github token for Jenkins",
    githubUsername,
    githubPassword
)

// Add the credentials to the global domain
def credentialsStore = jenkinsInstance.getExtensionList('com.cloudbees.plugins.credentials.SystemCredentialsProvider')[0].getStore()
credentialsStore.addCredentials(domain, githubCredentials)

println "GitHub credentials added successfully with ID: github_token"
