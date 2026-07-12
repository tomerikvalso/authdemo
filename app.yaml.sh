#!/bin/bash
echo """
runtime: nodejs24
env: standard
service: $GCLOUD_APP_SERVICE
automatic_scaling:
  max_instances: 3
env_variables:
  ENV: $ENV
"""
