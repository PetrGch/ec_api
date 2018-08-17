###Contracts for currencyInfo page

Rest API: ./currency?companyId={companyId}
Parameters: 
    -companyId.
Method: *PUT*

```
[
  {
    "id": 1,
    "currencyName": "Euro",
    "currencyType": "EUR",
    "buyPrice": 123.23,
    "sellPrice": 133.23,
    "createdAt": "2018-07-08T14:55:28Z",
    "updatedAt": "2018-07-08T14:55:28Z"
  },
  {
    "id": 2,
    "currencyName": "Dollar",
    "currencyType": "USD",
    "buyPrice": 123.23,
    "sellPrice": 133.23,
    "createdAt": "2018-07-08T14:55:28Z",
    "updatedAt": "2018-07-08T14:55:28Z"
  },
  {
    "id": 3,
    "currencyName": "Funt",
    "currencyType": "GBR",
    "buyPrice": 123.23,
    "sellPrice": 133.23,
    "createdAt": "2018-07-08T14:55:28Z",
    "updatedAt": "2018-07-08T14:55:28Z"
  },
  {
    "currencyName": "Switzerland",
    "currencyType": "CHF",
    "buyPrice": 123,
    "sellPrice": 123
  }
]
```