# Relevant apis

> Note: All APIs except tracking require a header to be set, namely Authentication: Token XXXXXXXX to authorize requests.


### Cost Api
https://track.delhivery.com/api/kinko/v1/invoice/charges/.json
This api requires 5 parameters as part of the request params.

Sample - https://track.delhivery.com/api/kinko/v1/invoice/charges/.json?md=S&ss=RTO&d_pin=226010&o_pin=201016&cgm=1500

md - Refers to the mode of shipment (Can be E or S)

ss - refers to the status of shipment (Can be Delivered, RTO, DTO)

d_pin, o_pin - refers to the destination and origin pincode resp. (Must be a valid 6 digit pincode)

cgm - refers to the billable weight in grams


### Create Shipment API
https://staging-express.delhivery.com/api/cmu/create.json

Sample body - 
```
{
    "shipments": [
        {
        "add": "M25,NelsonMarg",
        "address_type": "home",
        "phone": "8310418179",
        "payment_mode": "COD",
        "name": "Shruti",
        "pin": "411021",
        "order": "3",
        "country": "India",
        "cod_amount": 1293.89,
        "waybill": "",
        "shipping_mode" : "Surface"
        }
    ],
    "pickup_location": {
    "name": "ESS SURFACE",
    "city": "Pune",
    "pin": "411021",
    "country": "India",
    "phone": "8310418179",
    "add": "SAMSUKHA COMPLEX H. NO. 204 2ND FLOOR 2ND FLOOR BELAGAVI KHADE BAZAR , Belgaun, Karnataka ,India 590001"
    }
}
```

Relevant docs: https://one.delhivery.com/developer-portal/document/detail/order-creation

### Update/Cancel Shipment API
https://track.delhivery.com/api/p/edit

Sample body -

```
{
    "waybill": "11675107363674",  
    "shipment_width": 10.0,
    "product_category": "category",
    "product_details": "product details",
    "add": "abc road,house no 2"
}
```

Relevant docs: https://one.delhivery.com/developer-portal/document/detail/order-updation

### Track shipment API
https://track.delhivery.com/api/v1/packages/json/

This api requires two params in the request params

Sample request - https://track.delhivery.com/api/v1/packages/json?waybill=11675107363744&token=XXXXXXXXXXXXXXXXXXXXXXXX

Token - the api token for authentication

Waybill - the waybill number