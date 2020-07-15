# apama-analyticsbuilder-block-getHttpMicroserviceRequest
## How to trigger microservice applications within Apama Analytics Builder via HTTP request
In some cases, while developing a business rule using Apama Analytics Builder it is very useful to trigger actions of a pre-deployed microservice to get further calculations or information of a 3rd party system
For doing this a HTTP communication between Apama Analytics Builder workbench and microservices is recommended. 

Requirements:
	•	A Cumulocity tenant with a suitable apama-ctrl microservice subscribed (custom blocks are not supported with apama-ctrl-starter).
	•	An uploaded microservice with http access endpoints
	•	Software AG Designer with a local install of Apama (either Software AG suite or Community Edition)
	•	Http example block as draft, checkout at https://github.com/SoftwareAG/apama-analytics-builder-block-sdk/blob/master/samples/blocks/HttpOutputBlock.mon. 
