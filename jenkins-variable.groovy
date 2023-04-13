def jenkinsVariables = [
  AWS_DEFAULT_REGION: "your_aws_region",
  AWS_ACCESS_KEY_ID: "your_aws_access_key_id",
  AWS_SECRET_ACCESS_KEY: "your_aws_secret_access_key",
  DOCKER_REGISTRY: "your_docker_registry",
  IMAGE_NAME: "your_image_name",
  ECS_CLUSTER: "your_ecs_cluster_name",
  ECS_SERVICE: "your_ecs_service_name",
  CODECOMMIT_REPO: "your_codecommit_repo_name",
  CODECOMMIT_BRANCH: "your_codecommit_branch_name"
]

return jenkinsVariables

