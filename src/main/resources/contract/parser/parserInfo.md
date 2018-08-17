###Contracts for parserInfo page

Rest API: ./parser?companyId={companyId}
Parameters: 
    -companyId.

Method: *PUT*

```
{
  "url": "someCompany.co",
  "parameters": "parameters",
  "rowSelector": "rowSelector",
  "currencyAmountSelector": "currencyAmountSelector",
  "currencyTypeSelector": "currencyTypeSelector",
  "buySelector": "buySelector",
  "sellSelector": "sellSelector",
  "active": false
}
```

Rest API: ./parser/checkParser?companyId={companyId}
Parameters: 
    -companyId.

Method: *GET*