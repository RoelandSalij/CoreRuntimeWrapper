## Introduction
This module contains microflows which expose runtime core API methods as java actions. These java actions can be used in your microflows.

The module also contains a template for a published rest service which exposes project specific information. 
You consume use this rest service from a central providing you with a nice overview of all your running applications.

## Get Started
- Use a java action in your microflow!

## Published REST Service
Move the published REST to a custom module in your project.
Include the published REST service into your project. (Right click on document in project navigation dock → Include in project)
Configure the module role in the module to be one of the module roles of a user role.
Example

`{ "nr_of_concurrent_anonymous_users": 0, "nr_of_concurrent_named_users": 1, "maximum_concurrent_users_since_start": 1, "model_version": "unversioned", "base_project_id": "8e7b0165-3c0e-4c89-9116-f59400a670e7", "started_at": "2021-01-21T17:36:29.404Z", "is_in_development": true, "configuration": { "admin_username": "MxAdmin", "admin_userrole": "MxAdmin", "application_root_url": "http://localhost:8080/", "client_query_timeout": -1, "file_separator": "/", "is_guest_login_enabled": false, "guest_userrole": "", "modeler_filename": "model.mdp", "resources_path": "resources", "temp_path": "tmp", "session_timeout": 600000 } }`