## Description

play2-ldap-activedirectory offers examples of authenticating and authorizing users via ldap bind against active directory.
The application is built with Play 2 and Scala and uses the UnboundID LDAP SDK for LDAP connectivity.
It is assumed that the ldap server is an Active Directory Domain Controller.

## Motivation

The goal of creating this sample application was to provide for the possibility of evaluating Play 2 as a framework with potential in the enterprise.
Integration with Active Directory is often a critical requirement for large companies.

## Features

  * Authorize users based on membership in an active directory group
  * Authenticate user password by performing LDAP bind operation
  * LDAP search for user and group information
  * LDAP server connection pooling
  * Secure LDAP connection
  * Get DN for username from LDAP server
  * Get group membership status from LDAP server
  * Get user metadata from LDAP server
  
## License

This project uses the Apache 2.0 license. Read LICENSE file.

## Authors and Copyright

Copyright (C) 2015 Jason Mar
