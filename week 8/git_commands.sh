#!/bin/bash
# Git Hands-on commands

git init
git status
git add welcome.txt
git commit -m "Add welcome.txt file"
git status
# Assuming remote already set
git pull origin master
git push origin master
