###Contracts for companyInfo page

Rest API: ./company/{id}

Method: *PUT*

*Request body:*

```
{
  "id": 1,
  "key": "f08f61b2-bc76-4919-ab04-1a033eeb6b8e",
  "uniqueId": "f08f61b2-bc76-4919-ab04-1a033eeb6b8e",
  "name": "company test 1",
  "coordinateX": "111111.111",
  "coordinateY": "111111.111",
  "address": "address",
  "rating": 3.5,
  "createdAt": "2018-07-08T14:55:28Z",
  "updatedAt": "2018-07-08T14:55:28Z",
  "exchangeCompanyDetail": {
    "description": "long long descriptio",
    "phone": "234234234",
    "website": "some.com",
    "email": "some@gmail.com",
    "exchangeCompany": null
  },
  "workingTime": {
    "mnFrom": "12:00:00",
    "mnTo": "18:00:00",
    "tuFrom": "12:00:00",
    "tuTo": "18:00:00",
    "weFrom": "12:00:00",
    "weTo": "18:00:00",
    "thFrom": "12:00:00",
    "thTo": "18:00:00",
    "frFrom": "12:00:00",
    "frTo": "18:00:00",
    "stFrom": "12:00:00",
    "stTo": "18:00:00",
    "snFrom": "12:00:00",
    "snTo": "18:00:00"
  },
  "comments": [
    {
      "id": 1,
      "name": "name 1",
      "title": "title 1",
      "text": "Long long comment",
      "createdAt": "2018-07-08T14:55:28Z",
      "updatedAt": "2018-07-08T14:55:28Z",
      "dislike": true,
      "liked": false
    },
    {
      "id": 2,
      "name": "name 1",
      "title": "title 1",
      "text": "Long long comment",
      "createdAt": "2018-07-08T14:55:28Z",
      "updatedAt": "2018-07-08T14:55:28Z",
      "dislike": false,
      "liked": true
    },
    {
      "id": 3,
      "name": "name 1",
      "title": "title 1",
      "text": "Long long comment",
      "createdAt": "2018-07-08T14:55:28Z",
      "updatedAt": "2018-07-08T14:55:28Z",
      "dislike": false,
      "liked": true
    },
    {
      "id": 4,
      "name": "name 1",
      "title": "title 1",
      "text": "Long long comment Long long comment Long long comment Long long comment Long long comment",
      "createdAt": "2018-07-08T14:55:28Z",
      "updatedAt": "2018-07-08T14:55:28Z",
      "dislike": false,
      "liked": true
    }
  ],
  "currencyRates": [
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
    }
  ],
  "exchangeCompanyParseData": {
    "url": "someCompany.com",
    "parameters": "parameters",
    "rowSelector": "rowSelector",
    "currencyAmountSelector": "currencyAmountSelector",
    "currencyTypeSelector": "currencyTypeSelector",
    "buySelector": "buySelector",
    "sellSelector": "sellSelector",
    "active": false
  }
}
```