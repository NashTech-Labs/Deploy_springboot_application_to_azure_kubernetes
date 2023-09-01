### For setting up the Automated github pipeline the pre requisite you need:


![](/home/knoldus/Documents/sdk/deploy_springboot_application_to_azure_kubernetes/Diagram.png)


* Must have a microsoft azure account 
* Create a resouce group in the azure you can create it from dashboard or by using the command
`  az group create --name {group name} --location {azure region}`
* Create a kubernetes cluster in the azure you can create it from dashboard or by using the command
`  az aks create \
  --resource-group "Kubernetes-Cloud" \
  --generate-ssh-keys \
  --name CSCluster \
  --node-count 3 #default Node count is 3`
* Create a service principal by the running the command on azure cli
`  az ad sp create-for-rbac --name <service_principal_name> --role contributor --scopes /subscriptions/<subscription_id>/resourceGroups/<resource_group_name> --sdk-auth`
* once the credentials are generated save them into your repositery in the secrets
`  https://github.com/{username}/{repo-name}/settings/secrets/actions`
Once you have performed above steps push your code in git and check the pipelines will run and will get deployed you can see the host from the service and ingress option in the cluster which you have created with the name as external ip
"If you want to see the pipeline flow then you can check inside the actions tab in github"