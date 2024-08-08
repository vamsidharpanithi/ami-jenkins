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

multibranchPipelineJob('Aws-pr-check') {
    displayName('Aws-pr-check')
    description('AWS Status check on pull')
    branchSources {
        github {
            id('Aws-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('infra-aws')
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

multibranchPipelineJob('Consumer-pr-check') {
    displayName('Consumer-pr-check')
    description('Consumer app Status check on pull')
    branchSources {
        github {
            id('Consumer-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('webapp-cve-consumer')
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

multibranchPipelineJob('consumerhelm-pr-check') {
    displayName('consumerhelm-pr-check')
    description('Consumerhelm Status check on pull')
    branchSources {
        github {
            id('consumerhelm-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('helm-webapp-cve-consumer')
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

multibranchPipelineJob('Autoscalerhelm-pr-check') {
    displayName('Autoscalerhelm-pr-check')
    description('Autoscalerhelm Status check on pull')
    branchSources {
        github {
            id('Autoscalerhelm-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('helm-eks-autoscaler')
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

multibranchPipelineJob('Operator-pr-check') {
    displayName('Operator-pr-check')
    description('Operator app Status check on pull')
    branchSources {
        github {
            id('Operator-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('cve-operator')
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

multibranchPipelineJob('Operatorhelm-pr-check') {
    displayName('Operatorhelm-pr-check')
    description('Operatorhelm Status check on pull')
    branchSources {
        github {
            id('Operatorhelm-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('helm-cve-operator')
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


multibranchPipelineJob('CloudWatchhelm-pr-check') {
    displayName('CloudWatchhelm-pr-check')
    description('CloudWatchhelm Status check on pull')
    branchSources {
        github {
            id('CloudWatchhelm-pr-check')
            apiUri('https://api.github.com')
            repoOwner('cyse7125-su24-team04')
            repository('helm-cloudewatch')
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