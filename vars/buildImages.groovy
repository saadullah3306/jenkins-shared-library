def call(String backendPath, String frontendPath, String imageTag) {
    env.BACKEND_TAG_DH  = "${env.DOCKERHUB_USER}/three-tier-application-backend:${imageTag}"
    env.FRONTEND_TAG_DH = "${env.DOCKERHUB_USER}/three-tier-application-frontend:${imageTag}"
    sh """
        docker build -t ${BACKEND_TAG_DH} ${backendPath}
        docker build -t ${FRONTEND_TAG_DH} ${frontendPath}
    """
}
