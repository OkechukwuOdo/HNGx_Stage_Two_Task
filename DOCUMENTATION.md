## Create Person
* Description: Create a new person entry.

URL: /api

Method: POST

Request:

{
"name": "Mike Okonkwo"
 "gender": "male"
 "phone_number": "+2347073595060"
}
Response (HTTP Status Code 200: ok)

{
"name": "Mike Okonkwo"
"gender": "male"
"phone_number": "+2347073595060"
}


## Get a Person By Name
* Description: Retrieve details of a person by name.

URL: /api/user_id

Method: GET

Request: No request body is required for this endpoint.

Response:
{
"name":"Mike Okonkwo"
"gender":"male"
"phone_number":"+2347073595060"
}

## Delete User with id
* Description: Delete user with certain id.

URL: /api/user_id

Method: DELETE

Request: No request body is required for this endpoint.

Response:

"User by name <Name of user> has been deleted from database"

## Update a user with the user_id
* Description: Update the user detail to a provided user detail.

URL: /api/user_id

Method: PUT

Request:

{
"name": "Mercy Agu"
"gender": "female"
"phone_number": "+2347073595060"
}

Response (HTTP Status Code 200: ok)
{
"name": "Mercy Agu"
"gender": "female"
"phone_number": "+2347073595060"
}

