Four different types of Singletons here

1. Unsafe for threading
2. Basic synchronized: ie creation operations are locked to one request at a time
3. Eagerly created: ie instantiated with class
4. Double checked to reduce scope of synchronized