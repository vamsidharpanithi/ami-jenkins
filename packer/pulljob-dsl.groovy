multibranchPipelineJob('DB-pr-check') {
    displayName('DB-PR-check')
    description('Checks status on pull request')
    branchSources {
        github {
            id('DB-PR-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('db-migration')
            scanCredentialsId('github_token')
            includes('*')
        }
    }


    configure {
        def traits = it / 'sources' / 'data' / 'jenkins.branch.BranchSource' / 'source' / 'traits'
        // Add the ForkPullRequestDiscoveryTrait
        traits << 'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
            strategyId(2) 
        }
    }

    configure { node ->
     def webhookTrigger = node / triggers / 'com.igalg.jenkins.plugins.mswt.trigger.ComputedFolderWebHookTrigger' {
                spec('')
                token("cvewebkhook")
            }
    }
}

multibranchPipelineJob('Webapp-pr-check') {
    displayName('Webapp-pr-check')
    description('PR check for webapp')
    branchSources {
        github {
            id('Webapp-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('webapp-cve-processor')
            scanCredentialsId('github_token')
            includes('*')
        }
    }


    configure {
        def traits = it / 'sources' / 'data' / 'jenkins.branch.BranchSource' / 'source' / 'traits'
        // Add the ForkPullRequestDiscoveryTrait
        traits << 'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
            strategyId(2) 
        }
    }

    configure { node ->
     def webhookTrigger = node / triggers / 'com.igalg.jenkins.plugins.mswt.trigger.ComputedFolderWebHookTrigger' {
                spec('')
                token("cvewebkhook")
            }
    }
}

multibranchPipelineJob('helm-pr-check') {
    displayName('helm-pullcheck')
    description('helm status check on pull')
    branchSources {
        github {
            id('helm-pullcheck')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('helm-webapp-cve-processor')
            scanCredentialsId('github_token')
            includes('*')
        }
    }


    configure {
        def traits = it / 'sources' / 'data' / 'jenkins.branch.BranchSource' / 'source' / 'traits'
        // Add the ForkPullRequestDiscoveryTrait
        traits << 'org.jenkinsci.plugins.github__branch__source.ForkPullRequestDiscoveryTrait' {
            strategyId(2) 
        }
    }

    configure { node ->
     def webhookTrigger = node / triggers / 'com.igalg.jenkins.plugins.mswt.trigger.ComputedFolderWebHookTrigger' {
                spec('')
                token("cvewebkhook")
            }
    }
}

