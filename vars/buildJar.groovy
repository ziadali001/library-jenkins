#!/usr/bin/env groovy

def call() {
    echo "building the application for branch $BARNCH_NAME"
    sh 'mvn package'
}