###Contracts for newCompany page

Rest API: ./company
Method: *POST*

*Request body:*
```
{
  "workingTime": {
    "mnFrom": "22:00:00",
    "tuFrom": "22:00:10",
    "weFrom": "22:00:20",
    "thFrom": "22:00:30",
    "frFrom": "22:00:40",
    "stFrom": "22:00:50",
    "snFrom": "22:15:00",
    "mnTo": "22:15:10",
    "tuTo": "22:15:20",
    "weTo": "22:15:30",
    "thTo": "22:15:40",
    "frTo": "22:15:50",
    "stTo": "22:30:00",
    "snTo": "22:30:10"
  },
  "exchangeCompanyDetail": {
    "description": "description",
    "website": "website.com",
    "phone": "+48735010878",
    "email": "petr.gulchuk@gmail.com"
  },
  "name": "company name",
  "address": "address company",
  "coordinateX": "111111.1111",
  "coordinateY": "111111.1"
}
```