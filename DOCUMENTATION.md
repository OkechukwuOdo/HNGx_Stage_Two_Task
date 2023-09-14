## Create Person
* Description: Create a new person entry.

URL: https://hngx-stage-two-task-app.onrender.com/api

Method: POST

RequestBody:

{
"name": "Mike Okonkwo"
}
Response (HTTP Status Code 200: ok)

{
"id": 1
"name": "Mike Okonkwo"
}


## Get a Person By Name
* Description: Retrieve details of a person by id.

URL: https://hngx-stage-two-task-app.onrender.com/api/user_id

Method: GET

RequestBody: No request body is required for this endpoint.

Response:
{
"id": 1
"name": "Mike Okonkwo"
}

## Delete User with id
* Description: Delete user with certain id.

URL: https://hngx-stage-two-task-app.onrender.com/api/user_id

Method: DELETE

RequestBody: No request body is required for this endpoint.

Response:

"User by name <Name of user> has been deleted from database"

## Update a user with the user_id
* Description: Update the user detail to a provided user detail.

URL: https://hngx-stage-two-task-app.onrender.com/api/user_id

Method: PUT

RequestBody:

{
"name": "Janu Anu"
}

Response (HTTP Status Code 200: ok)
{
"id": 1
"name": "Jane Anu"
}

