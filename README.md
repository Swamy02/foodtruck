Food Truck Service API Documentation
Overview
The Food Truck Service API is designed to provide users with access to information about food trucks in a given area. The API allows users to retrieve a list of all food trucks available in the dataset or search for specific food trucks by applicant name.

Key Features
Get All Food Trucks: Users can retrieve a comprehensive list of all food trucks available in the dataset. This endpoint returns detailed information about each food truck, including its location ID, applicant name, facility type, address, permit status, and more.

Target Audience
The Food Truck Service API is intended for a wide range of users, including:
Food enthusiasts who want to explore the diverse food truck scene in their area.
Event organizers who need to hire food trucks for festivals, concerts, and other events.
City officials and urban planners who want to analyze food truck trends and patterns for city planning purposes.
Developers who wish to integrate food truck data into their applications, such as restaurant discovery apps or event planning platforms.

Use Case Scenarios
Food Truck Exploration: A food enthusiast uses the API to discover new and exciting food trucks in their city. They browse through the list of available food trucks, read reviews, and plan their next culinary adventure.
Event Planning: An event organizer searches for food trucks to cater their upcoming music festival. They use the API to find food trucks that offer the cuisine and services they require, such as vegetarian options or on-site cooking facilities.
Urban Analysis: A city official analyzes food truck data to understand the distribution and popularity of food trucks across different neighborhoods. They use the API to retrieve aggregated statistics and visualize trends over time, helping inform urban development decisions.
Application Integration: A developer integrates the API into their restaurant discovery app, allowing users to find nearby food trucks based on their current location. They leverage the search functionality to provide users with personalized recommendations and real-time updates on food truck locations.


Conclusion
The Food Truck Service API offers a valuable resource for food enthusiasts, event organizers, city officials, and developers alike. By providing easy access to comprehensive food truck data, the API enables users to explore, plan, analyze, and innovate within the vibrant world of food trucks.


Base URL
The base URL for accessing the Food Truck Service API is:


http://localhost:8091/api/foodtrucks/getAllFoodTruck


Endpoints
Get All Food Trucks
This endpoint retrieves a list of all food trucks available in the dataset.
URL: /getAllFoodTruck
Method: GET
Response: JSON array containing information about all food trucks.





