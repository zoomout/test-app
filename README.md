# test-app

Create custom role definition

```
az cosmosdb sql role definition create --account-name <cosmos-db-account-name> --resource-group <resource-group> --body @role-definition-rw.json
```

Assign custom role definition to a user
```
az cosmosdb sql role assignment create --account-name <cosmos-db-account-name> --resource-group <resource-group> --scope "/" --principal-id <user id/managed identity id> --role-definition-id "id of role definition created before"
```
