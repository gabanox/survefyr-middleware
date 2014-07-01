# JAX-RS Template Application

This is a template for a lightweight RESTful API using JAX-RS. The sample code is a call for getting the current time.
    
## Running the application locally

First build with:

    $mvn clean install

Then run it with:

    $ java -cp target/classes:target/dependency/* com.example.Main


# RESTFULL API 

# API #

Documentación de la API

| Recurso   		|    GET   								|  PUT  		|  POST 	| DELETE  		|
| :-------- 		| :-------------						| :--   		| :--   	| :--    		|
| SURVEY			| /surveys 								|  - 			| -			| -  			|
| SURVEY			| /surveys/types						|  - 			| -			| -  			|
| SURVEY			| /survey/{id} 							|  /survey/{id}	| /survey 	| /survey/{id}  |
| USER 				| /user/{id} (ANONYMOUS)  				| -  		  	|  -     	|     -   		|
| USER 				| /user/1 (USER_AUTHENTICATED)  		| - 		  	|  -     	|     -   		|

