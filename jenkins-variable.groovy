def jenkinsVariables = [
  AWS_DEFAULT_REGION: "ap-southeast-1",
  AWS_ACCESS_KEY_ID: "AKIA3SA4HLZ3A73VBH2D",
  AWS_SECRET_ACCESS_KEY: "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",
  DOCKER_REGISTRY: "my-image-repo",
  IMAGE_NAME: "myimage",
  ECS_CLUSTER: "MY-ECS-cluster",
  ECS_SERVICE: "my-ecs-service",
  CODECOMMIT_REPO: "Hello-world",
  CODECOMMIT_BRANCH: "master"
]

return jenkinsVariables

