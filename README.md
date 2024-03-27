** How to run the project **
1. Install docker using Docker website - https://www.docker.com/get-started/
2. Run the docker application, more specifically docker daemon. We want to build a docker image and run a docker container and in order to do that docker daemon must be running. Running docker desktop application is one way to run docker daemon
3. Navigate to the root folder of the project.
4. Run `docker build -t protek-app:latest .`
5. Run `docker run protek-app:latest` - This command should run all the unit tests in the project
6. To clean up the container, run `docker ps -a` and find the container id belonging to `protek-app:latest`
7. Run `docker rm {CONTAINER_ID found in step 6}`