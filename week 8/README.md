# Git Branching & Merging Lab

## Branching Steps
```bash
git branch GitNewBranch
git branch -a
git checkout GitNewBranch
echo "Hello from new branch" > newfile.txt
git add newfile.txt
git commit -m "Added newfile.txt in GitNewBranch"
git push origin GitNewBranch
```

## GitHub Steps
1. Go to your repository on GitHub.
2. Click **Compare & pull request**.
3. Add title → “Merge GitNewBranch into master”.
4. Click **Create pull request**.
5. Review & merge.

## Merging Steps (Locally)
```bash
git checkout master
git pull origin master
git branch -d GitNewBranch
git push origin --delete GitNewBranch
```
