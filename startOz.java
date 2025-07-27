Last login: Wed Jul 23 00:03:53 on ttys000
^C%                                                                             tasneemibrahim@Tasneems-MacBook-Air ~ % git checkout -b warmup1-sleepIn
Switched to a new branch 'warmup1-sleepIn'
tasneemibrahim@Tasneems-MacBook-Air ~ % mkdir -p warmup1
tasneemibrahim@Tasneems-MacBook-Air ~ % cd warmup1
tasneemibrahim@Tasneems-MacBook-Air warmup1 % touchSleepIn.java
zsh: command not found: touchSleepIn.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % touch SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
zsh: event not found: weekday
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % javac SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % java SleepIn

sleepIn(false, false): true
sleepIn(true, false): false
sleepIn(false, true): true
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git init
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint:
hint: 	git config --global init.defaultBranch <name>
hint:
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint:
hint: 	git branch -m <name>
hint:
hint: Disable this message with "git config set advice.defaultBranchName false"
Initialized empty Git repository in /Users/tasneemibrahim/warmup1/.git/
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add .
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sleepIn"
[master (root-commit) d98d821] Add solution for warmup1-sleepIn
 2 files changed, 13 insertions(+)
 create mode 100644 SleepIn.class
 create mode 100644 SleepIn.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-sleepIn
error: src refspec warmup1-sleepIn does not match any
error: failed to push some refs to 'origin'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-sleepIn

Switched to a new branch 'warmup1-sleepIn'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/your-username/your-repo-name.git
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/Tasneem201/Warmup-1sleepIn
error: remote origin already exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote -v
origin	https://github.com/your-username/your-repo-name.git (fetch)
origin	https://github.com/your-username/your-repo-name.git (push)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
remote: Repository not found.
fatal: repository 'https://github.com/your-username/your-repo-name.git/' not found
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git status
On branch warmup1-sleepIn
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/Tasneem201/Warmup-1sleepIn
error: remote origin already exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote set-url origin https://github.com/Tasneem201/Warmup-1sleepIn.git

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.06 KiB | 1.06 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-sleepIn -> warmup1-sleepIn
branch 'warmup1-sleepIn' set up to track 'origin/warmup1-sleepIn'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b main
Switched to a new branch 'main'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin main
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'main' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/main
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add .
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
[main bc61ec0] Add solution for warmup1-monkeyTrouble
 1 file changed, 3 insertions(+)
 create mode 100644 monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-monkeyTrouble      
error: src refspec warmup1-monkeyTrouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-sleepIn        
Everything up-to-date
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-monkeyTrouble

Switched to a new branch 'warmup1-monkeyTrouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MonkeyTrouble.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls
SleepIn.class		SleepIn.java		monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   monkeyTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
[warmup1-monkeyTrouble 2c79992] Add solution for warmup1-monkeyTrouble
 1 file changed, 12 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-monkeyTrouble
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 782 bytes | 782.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), done.
remote: 
remote: Create a pull request for 'warmup1-monkeyTrouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-monkeyTrouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-monkeyTrouble -> warmup1-monkeyTrouble
branch 'warmup1-monkeyTrouble' set up to track 'origin/warmup1-monkeyTrouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano sumDouble.java       
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add sumDouble.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"    
[warmup1-monkeyTrouble e71aaba] Add solution for warmup1-sumDouble
 1 file changed, 7 insertions(+)
 create mode 100644 sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble    
error: src refspec warmup1-sumDouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble
error: src refspec warmup1-sumDouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-sumDouble
Switched to a new branch 'warmup1-sumDouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SumDouble.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add SumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
On branch warmup1-sumDouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SumDouble.java                            

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add SumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
On branch warmup1-sumDouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   sumDouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
[warmup1-sumDouble f672a23] Add solution for warmup1-sumDouble
 1 file changed, 15 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 799 bytes | 799.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-sumDouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-sumDouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-sumDouble -> warmup1-sumDouble
branch 'warmup1-sumDouble' set up to track 'origin/warmup1-sumDouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano diff21.java                               

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add diff21.java       
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-diff21"   
[warmup1-sumDouble 4660174] Add solution for warmup1-diff21
 1 file changed, 7 insertions(+)
 create mode 100644 diff21.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-diff21   
error: src refspec warmup1-diff21 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-diff21

Switched to a new branch 'warmup1-diff21'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add diff21.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-diff21"
On branch warmup1-diff21
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-diff21

Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 364 bytes | 364.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-diff21' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-diff21
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-diff21 -> warmup1-diff21
branch 'warmup1-diff21' set up to track 'origin/warmup1-diff21'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano parrotTrouble.java                                      
 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add parrotTrouble.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble" 
[warmup1-diff21 ca52d17] Add solution for warmup1-parrotTrouble
 1 file changed, 4 insertions(+)
 create mode 100644 parrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-parrotTrouble
error: src refspec warmup1-parrotTrouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-parrotTrouble

Switched to a new branch 'warmup1-parrotTrouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble"
On branch warmup1-parrotTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble"
On branch warmup1-parrotTrouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-parrotTrouble
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 386 bytes | 386.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-parrotTrouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-parrotTrouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-parrotTrouble -> warmup1-parrotTrouble
branch 'warmup1-parrotTrouble' set up to track 'origin/warmup1-parrotTrouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano makes10.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-makes10"      
[warmup1-parrotTrouble 55371d2] Add solution for warmup1-makes10
 1 file changed, 3 insertions(+)
 create mode 100644 makes10.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10           
error: src refspec warmup1-makes10 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-makes10

Switched to a new branch 'warmup1-makes10'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-makes10"
On branch warmup1-makes10
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10              
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 362 bytes | 362.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-makes10' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-makes10
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-makes10 -> warmup1-makes10
branch 'warmup1-makes10' set up to track 'origin/warmup1-makes10'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano nearHundred.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add nearHundred.java                        
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-nearHundreda"    
[warmup1-makes10 d018183] Add solution for warmup1-nearHundreda
 1 file changed, 4 insertions(+)
 create mode 100644 nearHundred.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10                
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 378 bytes | 378.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Tasneem201/Warmup-1sleepIn.git
   55371d2..d018183  warmup1-makes10 -> warmup1-makes10
branch 'warmup1-makes10' set up to track 'origin/warmup1-makes10'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-nearHundred               
error: src refspec warmup1-nearHundred does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 %  git checkout -b warmup1-nearHundred     

Switched to a new branch 'warmup1-nearHundred'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add nearHundred.java                             
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-nearHundreda"
On branch warmup1-nearHundred
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-nearHundred               
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'warmup1-nearHundred' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-nearHundred
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-nearHundred -> warmup1-nearHundred
branch 'warmup1-nearHundred' set up to track 'origin/warmup1-nearHundred'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git posNeg.java                                      
git: 'posNeg.java' is not a git command. See 'git --help'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java                                  
fatal: pathspec 'posNeg.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java                                  
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"      
[warmup1-nearHundred eac374d] Add solution for warmup1-posNeg
 1 file changed, 8 insertions(+)
 create mode 100644 posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-posNeg
error: src refspec warmup1-posNeg does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-posNeg

Switched to a new branch 'warmup1-posNeg'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano PosNeg.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add PosNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-PosNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % posNeg.java\

zsh: command not found: posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls -l

total 80
-rw-r--r--@ 1 tasneemibrahim  staff  1111 Jul 27 12:24 SleepIn.class
-rw-r--r--@ 1 tasneemibrahim  staff   488 Jul 27 12:24 SleepIn.java
-rw-r--r--  1 tasneemibrahim  staff   118 Jul 27 13:46 diff21.java
-rw-r--r--  1 tasneemibrahim  staff    89 Jul 27 14:05 makes10.java
-rw-r--r--  1 tasneemibrahim  staff   632 Jul 27 12:58 monkeyTrouble.java
-rw-r--r--  1 tasneemibrahim  staff   102 Jul 27 14:09 nearHundred.java
-rw-r--r--  1 tasneemibrahim  staff   531 Jul 27 14:01 parrotTrouble.java
-rw-r--r--  1 tasneemibrahim  staff   502 Jul 27 14:16 posNeg.java
-rw-r--r--  1 tasneemibrahim  staff   182 Jul 27 14:13 posNeg.java\
-rw-r--r--  1 tasneemibrahim  staff   495 Jul 27 13:13 sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano PosNeg.java                            

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add PosNeg.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-PosNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % rm "posNeg.java\\"

tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls
SleepIn.class		makes10.java		parrotTrouble.java
SleepIn.java		monkeyTrouble.java	posNeg.java
diff21.java		nearHundred.java	sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % posNeg.java   
zsh: command not found: posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
[warmup1-posNeg be4f008] Add solution for warmup1-posNeg
 1 file changed, 14 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-posNeg
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 817 bytes | 817.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-posNeg' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-posNeg
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-posNeg -> warmup1-posNeg
branch 'warmup1-posNeg' set up to track 'origin/warmup1-posNeg'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-notString"
[warmup1-posNeg ef154d1] Add solution for warmup1-notString
 1 file changed, 8 insertions(+)
 create mode 100644 notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-notString
error: src refspec warmup1-notString does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-notString

Switched to a new branch 'warmup1-notString'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano notString.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add NotString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-notString"
[warmup1-notString 5615dc6] Add solution for warmup1-notString
 1 file changed, 14 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-notString
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 820 bytes | 820.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-notString' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-notString
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-notString -> warmup1-notString
branch 'warmup1-notString' set up to track 'origin/warmup1-notString'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"     
[warmup1-notString bc9cd97] Add solution for warmup1-missingChar
 1 file changed, 4 insertions(+)
 create mode 100644 missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-missingChar           
error: src refspec warmup1-missingChar does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-missingChar

Switched to a new branch 'warmup1-missingChar'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MissingChar.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MissingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"
On branch warmup1-missingChar
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   missingChar.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add missingChar.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"
[warmup1-missingChar 005776b] Add solution for warmup1-missingChar
 1 file changed, 12 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-missingChar
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 773 bytes | 773.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-missingChar' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-missingChar
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-missingChar -> warmup1-missingChar
branch 'warmup1-missingChar' set up to track 'origin/warmup1-missingChar'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-frontBack"  
[warmup1-missingChar c1b1e13] Add solution for warmup1-frontBack
 1 file changed, 8 insertions(+)
 create mode 100644 frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-frontBack  
error: src refspec warmup1-frontBack does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-frontBack

Switched to a new branch 'warmup1-frontBack'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano frontBack.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add FrontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-frontBack"
[warmup1-frontBack 97174d6] Add solution for warmup1-frontBack
 1 file changed, 7 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-frontBack
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 788 bytes | 788.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-frontBack' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-frontBack
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-frontBack -> warmup1-frontBack
branch 'warmup1-frontBack' set up to track 'origin/warmup1-frontBack'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front3"   
[warmup1-frontBack 613b649] Add solution for warmup1-front3
 1 file changed, 4 insertions(+)
 create mode 100644 front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front3   
error: src refspec warmup1-front3 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-front3

Switched to a new branch 'warmup1-front3'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Front3.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front3"
[warmup1-front3 ac030b1] Add solution for warmup1-front3
 1 file changed, 8 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front3
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 750 bytes | 750.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-front3' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-front3
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-front3 -> warmup1-front3
branch 'warmup1-front3' set up to track 'origin/warmup1-front3'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
[warmup1-front3 9dcdccf] Add solution for warmup1-backAround
 1 file changed, 18 insertions(+)
 create mode 100644 backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-backAround                        
error: src refspec warmup1-backAround does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-backAround

Switched to a new branch 'warmup1-backAround'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add BackAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
On branch warmup1-backAround
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add backAround.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
On branch warmup1-backAround
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-backAround
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 550 bytes | 550.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-backAround' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-backAround
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-backAround -> warmup1-backAround
branch 'warmup1-backAround' set up to track 'origin/warmup1-backAround'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java
fatal: pathspec 'or35.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"      
[warmup1-backAround 55c38e2] Add solution for warmup1-or35
 1 file changed, 4 insertions(+)
 create mode 100644 or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-or35      
error: src refspec warmup1-or35 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-or35

Switched to a new branch 'warmup1-or35'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Or35.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add Or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"
On branch warmup1-or35
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   or35.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"
[warmup1-or35 4bcd021] Add solution for warmup1-or35
 1 file changed, 8 insertions(+), 1 deletion(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-or35
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 715 bytes | 715.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-or35' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-or35
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-or35 -> warmup1-or35
branch 'warmup1-or35' set up to track 'origin/warmup1-or35'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front22"
[warmup1-or35 5de78a6] Add solution for warmup1-front22
 1 file changed, 5 insertions(+)
 create mode 100644 front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front22
error: src refspec warmup1-front22 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-front22

Switched to a new branch 'warmup1-front22'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Front22.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front22.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front22"
[warmup1-front22 f41baaf] Add solution for warmup1-front22
 1 file changed, 8 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front22           
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 761 bytes | 761.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-front22' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-front22
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-front22 -> warmup1-front22
branch 'warmup1-front22' set up to track 'origin/warmup1-front22'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startHi"
[warmup1-front22 b439878] Add solution for warmup1-startHi
 1 file changed, 3 insertions(+)
 create mode 100644 startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startHi  
error: src refspec warmup1-startHi does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-startHi

Switched to a new branch 'warmup1-startHi'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano StartHi.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startHi"
[warmup1-startHi b068f28] Add solution for warmup1-startHi
 1 file changed, 12 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startHi
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 790 bytes | 790.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-startHi' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-startHi
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-startHi -> warmup1-startHi
branch 'warmup1-startHi' set up to track 'origin/warmup1-startHi'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-icyHot" 
[warmup1-startHi 5653644] Add solution for warmup1-icyHot
 1 file changed, 4 insertions(+)
 create mode 100644 icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-icyHot 
error: src refspec warmup1-icyHot does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-icyHot

Switched to a new branch 'warmup1-icyHot'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-icyHot"
[warmup1-icyHot 483b7ff] Add solution for warmup1-icyHot
 1 file changed, 11 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-icyHot
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 763 bytes | 763.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-icyHot' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-icyHot
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-icyHot -> warmup1-icyHot
branch 'warmup1-icyHot' set up to track 'origin/warmup1-icyHot'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % add git in1020.java

zsh: command not found: add
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add in1020.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-in1020"
[warmup1-icyHot ccb102a] Add solution for warmup1-in1020
 1 file changed, 19 insertions(+)
 create mode 100644 in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-in1020
error: src refspec warmup1-in1020 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-in1020

Switched to a new branch 'warmup1-in1020'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano In1020.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-in1020"
[warmup1-in1020 4818202] Add solution for warmup1-in1020
 1 file changed, 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-in1020
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 848 bytes | 848.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-in1020' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-in1020
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-in1020 -> warmup1-in1020
branch 'warmup1-in1020' set up to track 'origin/warmup1-in1020'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
fatal: pathspec 'hasTeen.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-hasTeen"
[warmup1-in1020 3f0b091] Add solution for warmup1-hasTeen
 1 file changed, 6 insertions(+)
 create mode 100644 hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-hasTeen
error: src refspec warmup1-hasTeen does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-hasTeen

Switched to a new branch 'warmup1-hasTeen'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano hasTeen.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-hasTeen"
[warmup1-hasTeen c80dc76] Add solution for warmup1-hasTeen
 1 file changed, 14 insertions(+), 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-hasTeen
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 794 bytes | 794.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-hasTeen' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-hasTeen
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-hasTeen -> warmup1-hasTeen
branch 'warmup1-hasTeen' set up to track 'origin/warmup1-hasTeen'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano  loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
[warmup1-hasTeen dfd2045] Add solution for warmup1-loneTeen
 1 file changed, 5 insertions(+)
 create mode 100644 loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-loneTeenn
error: src refspec warmup1-loneTeenn does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-loneTeen

Switched to a new branch 'warmup1-loneTeen'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano LoneTeen.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add LoneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
On branch warmup1-loneTeen
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   loneTeen.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add loneTeen.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
[warmup1-loneTeen ce6e9e5] Add solution for warmup1-loneTeen
 1 file changed, 14 insertions(+), 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-loneTeen
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 817 bytes | 817.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-loneTeen' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-loneTeen
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-loneTeen -> warmup1-loneTeen
branch 'warmup1-loneTeen' set up to track 'origin/warmup1-loneTeen'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-delDel"  
[warmup1-loneTeen 64f4e26] Add solution for warmup1-delDel
 1 file changed, 7 insertions(+)
 create mode 100644 delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 %  git push -u origin warmup1-delDel  
error: src refspec warmup1-delDel does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-delDel

Switched to a new branch 'warmup1-delDel'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano DelDel.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add DelDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-delDel"
On branch warmup1-delDel
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   delDel.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-delDel
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 411 bytes | 411.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-delDel' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-delDel
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-delDel -> warmup1-delDel
branch 'warmup1-delDel' set up to track 'origin/warmup1-delDel'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
[warmup1-delDel 9f56e78] Add solution for warmup1-mixStart
 1 file changed, 4 insertions(+)
 create mode 100644 mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-mixStart
error: src refspec warmup1-mixStart does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-mixStart

Switched to a new branch 'warmup1-mixStart'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MixStart.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
On branch warmup1-mixStart
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   delDel.java
	modified:   mixStart.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add mixStart.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
[warmup1-mixStart 66842dc] Add solution for warmup1-mixStart
 1 file changed, 11 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-mixStart
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 747 bytes | 747.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-mixStart' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-mixStart
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-mixStart -> warmup1-mixStart
branch 'warmup1-mixStart' set up to track 'origin/warmup1-mixStart'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano startOz.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startOz.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startOz" 
[warmup1-mixStart 557f8d5] Add solution for warmup1-startOz
 1 file changed, 12 insertions(+)
 create mode 100644 startOz.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startOzt
error: src refspec warmup1-startOzt does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-startOz

Switched to a new branch 'warmup1-startOz'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano StartOz.java


  UW PICO 5.09                                 File: StartOz.java                                 Modified  

public String startOz(String str) {
    String result = "";

    if (str.length() >= 1 && str                    
                      
     
                                                    
                      
     

                  
 



























^G Get Help       ^O WriteOut       ^R Read File      ^Y Prev Pg        ^K Cut Text       ^C Cur Pos        
^X Exit           ^J Justify        ^W Where is       ^V Next Pg        ^U UnCut Text     ^T To Spell      
Last login: Wed Jul 23 00:03:53 on ttys000
^C%                                                                             tasneemibrahim@Tasneems-MacBook-Air ~ % git checkout -b warmup1-sleepIn
Switched to a new branch 'warmup1-sleepIn'
tasneemibrahim@Tasneems-MacBook-Air ~ % mkdir -p warmup1
tasneemibrahim@Tasneems-MacBook-Air ~ % cd warmup1
tasneemibrahim@Tasneems-MacBook-Air warmup1 % touchSleepIn.java
zsh: command not found: touchSleepIn.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % touch SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
zsh: event not found: weekday
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % javac SleepIn.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % java SleepIn

sleepIn(false, false): true
sleepIn(true, false): false
sleepIn(false, true): true
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git init
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint:
hint: 	git config --global init.defaultBranch <name>
hint:
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint:
hint: 	git branch -m <name>
hint:
hint: Disable this message with "git config set advice.defaultBranchName false"
Initialized empty Git repository in /Users/tasneemibrahim/warmup1/.git/
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add .
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sleepIn"
[master (root-commit) d98d821] Add solution for warmup1-sleepIn
 2 files changed, 13 insertions(+)
 create mode 100644 SleepIn.class
 create mode 100644 SleepIn.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-sleepIn
error: src refspec warmup1-sleepIn does not match any
error: failed to push some refs to 'origin'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-sleepIn

Switched to a new branch 'warmup1-sleepIn'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/your-username/your-repo-name.git
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/Tasneem201/Warmup-1sleepIn
error: remote origin already exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote -v
origin	https://github.com/your-username/your-repo-name.git (fetch)
origin	https://github.com/your-username/your-repo-name.git (push)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
remote: Repository not found.
fatal: repository 'https://github.com/your-username/your-repo-name.git/' not found
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git status
On branch warmup1-sleepIn
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote add origin https://github.com/Tasneem201/Warmup-1sleepIn
error: remote origin already exists.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git remote set-url origin https://github.com/Tasneem201/Warmup-1sleepIn.git

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sleepIn
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.06 KiB | 1.06 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-sleepIn -> warmup1-sleepIn
branch 'warmup1-sleepIn' set up to track 'origin/warmup1-sleepIn'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b main
Switched to a new branch 'main'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin main
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'main' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/main
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add .
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
[main bc61ec0] Add solution for warmup1-monkeyTrouble
 1 file changed, 3 insertions(+)
 create mode 100644 monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-monkeyTrouble      
error: src refspec warmup1-monkeyTrouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push origin warmup1-sleepIn        
Everything up-to-date
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-monkeyTrouble

Switched to a new branch 'warmup1-monkeyTrouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MonkeyTrouble.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls
SleepIn.class		SleepIn.java		monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MonkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
On branch warmup1-monkeyTrouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   monkeyTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add monkeyTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-monkeyTrouble"
[warmup1-monkeyTrouble 2c79992] Add solution for warmup1-monkeyTrouble
 1 file changed, 12 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-monkeyTrouble
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 782 bytes | 782.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), done.
remote: 
remote: Create a pull request for 'warmup1-monkeyTrouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-monkeyTrouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-monkeyTrouble -> warmup1-monkeyTrouble
branch 'warmup1-monkeyTrouble' set up to track 'origin/warmup1-monkeyTrouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano sumDouble.java       
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add sumDouble.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"    
[warmup1-monkeyTrouble e71aaba] Add solution for warmup1-sumDouble
 1 file changed, 7 insertions(+)
 create mode 100644 sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble    
error: src refspec warmup1-sumDouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble
error: src refspec warmup1-sumDouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-sumDouble
Switched to a new branch 'warmup1-sumDouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SumDouble.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add SumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
On branch warmup1-sumDouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano SumDouble.java                            

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add SumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
On branch warmup1-sumDouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   sumDouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-sumDouble"
[warmup1-sumDouble f672a23] Add solution for warmup1-sumDouble
 1 file changed, 15 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-sumDouble
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 799 bytes | 799.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-sumDouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-sumDouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-sumDouble -> warmup1-sumDouble
branch 'warmup1-sumDouble' set up to track 'origin/warmup1-sumDouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano diff21.java                               

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add diff21.java       
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-diff21"   
[warmup1-sumDouble 4660174] Add solution for warmup1-diff21
 1 file changed, 7 insertions(+)
 create mode 100644 diff21.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-diff21   
error: src refspec warmup1-diff21 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-diff21

Switched to a new branch 'warmup1-diff21'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add diff21.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-diff21"
On branch warmup1-diff21
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-diff21

Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 364 bytes | 364.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-diff21' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-diff21
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-diff21 -> warmup1-diff21
branch 'warmup1-diff21' set up to track 'origin/warmup1-diff21'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano parrotTrouble.java                                      
 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add parrotTrouble.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble" 
[warmup1-diff21 ca52d17] Add solution for warmup1-parrotTrouble
 1 file changed, 4 insertions(+)
 create mode 100644 parrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-parrotTrouble
error: src refspec warmup1-parrotTrouble does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-parrotTrouble

Switched to a new branch 'warmup1-parrotTrouble'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble"
On branch warmup1-parrotTrouble
nothing to commit, working tree clean
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add ParrotTrouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-parrotTrouble"
On branch warmup1-parrotTrouble
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-parrotTrouble
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 386 bytes | 386.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-parrotTrouble' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-parrotTrouble
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-parrotTrouble -> warmup1-parrotTrouble
branch 'warmup1-parrotTrouble' set up to track 'origin/warmup1-parrotTrouble'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano makes10.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-makes10"      
[warmup1-parrotTrouble 55371d2] Add solution for warmup1-makes10
 1 file changed, 3 insertions(+)
 create mode 100644 makes10.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10           
error: src refspec warmup1-makes10 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-makes10

Switched to a new branch 'warmup1-makes10'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-makes10"
On branch warmup1-makes10
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10              
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 362 bytes | 362.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-makes10' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-makes10
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-makes10 -> warmup1-makes10
branch 'warmup1-makes10' set up to track 'origin/warmup1-makes10'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano nearHundred.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add nearHundred.java                        
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-nearHundreda"    
[warmup1-makes10 d018183] Add solution for warmup1-nearHundreda
 1 file changed, 4 insertions(+)
 create mode 100644 nearHundred.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-makes10                
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 378 bytes | 378.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Tasneem201/Warmup-1sleepIn.git
   55371d2..d018183  warmup1-makes10 -> warmup1-makes10
branch 'warmup1-makes10' set up to track 'origin/warmup1-makes10'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-nearHundred               
error: src refspec warmup1-nearHundred does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add makes10.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 %  git checkout -b warmup1-nearHundred     

Switched to a new branch 'warmup1-nearHundred'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add nearHundred.java                             
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-nearHundreda"
On branch warmup1-nearHundred
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-nearHundred               
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'warmup1-nearHundred' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-nearHundred
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-nearHundred -> warmup1-nearHundred
branch 'warmup1-nearHundred' set up to track 'origin/warmup1-nearHundred'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git posNeg.java                                      
git: 'posNeg.java' is not a git command. See 'git --help'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java                                  
fatal: pathspec 'posNeg.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java                                  
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"      
[warmup1-nearHundred eac374d] Add solution for warmup1-posNeg
 1 file changed, 8 insertions(+)
 create mode 100644 posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-posNeg
error: src refspec warmup1-posNeg does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-posNeg

Switched to a new branch 'warmup1-posNeg'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano PosNeg.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add PosNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-PosNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % posNeg.java\

zsh: command not found: posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls -l

total 80
-rw-r--r--@ 1 tasneemibrahim  staff  1111 Jul 27 12:24 SleepIn.class
-rw-r--r--@ 1 tasneemibrahim  staff   488 Jul 27 12:24 SleepIn.java
-rw-r--r--  1 tasneemibrahim  staff   118 Jul 27 13:46 diff21.java
-rw-r--r--  1 tasneemibrahim  staff    89 Jul 27 14:05 makes10.java
-rw-r--r--  1 tasneemibrahim  staff   632 Jul 27 12:58 monkeyTrouble.java
-rw-r--r--  1 tasneemibrahim  staff   102 Jul 27 14:09 nearHundred.java
-rw-r--r--  1 tasneemibrahim  staff   531 Jul 27 14:01 parrotTrouble.java
-rw-r--r--  1 tasneemibrahim  staff   502 Jul 27 14:16 posNeg.java
-rw-r--r--  1 tasneemibrahim  staff   182 Jul 27 14:13 posNeg.java\
-rw-r--r--  1 tasneemibrahim  staff   495 Jul 27 13:13 sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano PosNeg.java                            

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add PosNeg.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-PosNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
On branch warmup1-posNeg
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java
	modified:   posNeg.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	"posNeg.java\\"

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % rm "posNeg.java\\"

tasneemibrahim@Tasneems-MacBook-Air warmup1 % ls
SleepIn.class		makes10.java		parrotTrouble.java
SleepIn.java		monkeyTrouble.java	posNeg.java
diff21.java		nearHundred.java	sumDouble.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % posNeg.java   
zsh: command not found: posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add posNeg.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-posNeg"
[warmup1-posNeg be4f008] Add solution for warmup1-posNeg
 1 file changed, 14 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-posNeg
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 817 bytes | 817.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-posNeg' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-posNeg
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-posNeg -> warmup1-posNeg
branch 'warmup1-posNeg' set up to track 'origin/warmup1-posNeg'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-notString"
[warmup1-posNeg ef154d1] Add solution for warmup1-notString
 1 file changed, 8 insertions(+)
 create mode 100644 notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-notString
error: src refspec warmup1-notString does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-notString

Switched to a new branch 'warmup1-notString'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano notString.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add NotString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add notString.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-notString"
[warmup1-notString 5615dc6] Add solution for warmup1-notString
 1 file changed, 14 insertions(+), 5 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-notString
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 820 bytes | 820.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-notString' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-notString
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-notString -> warmup1-notString
branch 'warmup1-notString' set up to track 'origin/warmup1-notString'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"     
[warmup1-notString bc9cd97] Add solution for warmup1-missingChar
 1 file changed, 4 insertions(+)
 create mode 100644 missingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-missingChar           
error: src refspec warmup1-missingChar does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-missingChar

Switched to a new branch 'warmup1-missingChar'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MissingChar.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MissingChar.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"
On branch warmup1-missingChar
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   missingChar.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add missingChar.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-missingChar"
[warmup1-missingChar 005776b] Add solution for warmup1-missingChar
 1 file changed, 12 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-missingChar
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 773 bytes | 773.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-missingChar' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-missingChar
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-missingChar -> warmup1-missingChar
branch 'warmup1-missingChar' set up to track 'origin/warmup1-missingChar'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-frontBack"  
[warmup1-missingChar c1b1e13] Add solution for warmup1-frontBack
 1 file changed, 8 insertions(+)
 create mode 100644 frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-frontBack  
error: src refspec warmup1-frontBack does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-frontBack

Switched to a new branch 'warmup1-frontBack'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano frontBack.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add FrontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add frontBack.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-frontBack"
[warmup1-frontBack 97174d6] Add solution for warmup1-frontBack
 1 file changed, 7 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-frontBack
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 788 bytes | 788.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-frontBack' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-frontBack
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-frontBack -> warmup1-frontBack
branch 'warmup1-frontBack' set up to track 'origin/warmup1-frontBack'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front3"   
[warmup1-frontBack 613b649] Add solution for warmup1-front3
 1 file changed, 4 insertions(+)
 create mode 100644 front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front3   
error: src refspec warmup1-front3 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-front3

Switched to a new branch 'warmup1-front3'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Front3.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front3.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front3"
[warmup1-front3 ac030b1] Add solution for warmup1-front3
 1 file changed, 8 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front3
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 750 bytes | 750.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-front3' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-front3
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-front3 -> warmup1-front3
branch 'warmup1-front3' set up to track 'origin/warmup1-front3'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
[warmup1-front3 9dcdccf] Add solution for warmup1-backAround
 1 file changed, 18 insertions(+)
 create mode 100644 backAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-backAround                        
error: src refspec warmup1-backAround does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-backAround

Switched to a new branch 'warmup1-backAround'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add BackAround.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
On branch warmup1-backAround
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add backAround.java 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-backAround"
On branch warmup1-backAround
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-backAround
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 550 bytes | 550.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-backAround' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-backAround
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-backAround -> warmup1-backAround
branch 'warmup1-backAround' set up to track 'origin/warmup1-backAround'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java
fatal: pathspec 'or35.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"      
[warmup1-backAround 55c38e2] Add solution for warmup1-or35
 1 file changed, 4 insertions(+)
 create mode 100644 or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-or35      
error: src refspec warmup1-or35 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-or35

Switched to a new branch 'warmup1-or35'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Or35.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add Or35.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"
On branch warmup1-or35
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   or35.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add or35.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-or35"
[warmup1-or35 4bcd021] Add solution for warmup1-or35
 1 file changed, 8 insertions(+), 1 deletion(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-or35
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 715 bytes | 715.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-or35' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-or35
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-or35 -> warmup1-or35
branch 'warmup1-or35' set up to track 'origin/warmup1-or35'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front22"
[warmup1-or35 5de78a6] Add solution for warmup1-front22
 1 file changed, 5 insertions(+)
 create mode 100644 front22.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front22
error: src refspec warmup1-front22 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-front22

Switched to a new branch 'warmup1-front22'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano Front22.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add front22.java                            
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-front22"
[warmup1-front22 f41baaf] Add solution for warmup1-front22
 1 file changed, 8 insertions(+)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-front22           
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 761 bytes | 761.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-front22' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-front22
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-front22 -> warmup1-front22
branch 'warmup1-front22' set up to track 'origin/warmup1-front22'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startHi"
[warmup1-front22 b439878] Add solution for warmup1-startHi
 1 file changed, 3 insertions(+)
 create mode 100644 startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startHi  
error: src refspec warmup1-startHi does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-startHi

Switched to a new branch 'warmup1-startHi'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano StartHi.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startHi.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startHi"
[warmup1-startHi b068f28] Add solution for warmup1-startHi
 1 file changed, 12 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startHi
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 790 bytes | 790.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-startHi' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-startHi
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-startHi -> warmup1-startHi
branch 'warmup1-startHi' set up to track 'origin/warmup1-startHi'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % 
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-icyHot" 
[warmup1-startHi 5653644] Add solution for warmup1-icyHot
 1 file changed, 4 insertions(+)
 create mode 100644 icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-icyHot 
error: src refspec warmup1-icyHot does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-icyHot

Switched to a new branch 'warmup1-icyHot'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano icyHot.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add icyHot.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-icyHot"
[warmup1-icyHot 483b7ff] Add solution for warmup1-icyHot
 1 file changed, 11 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-icyHot
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 763 bytes | 763.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-icyHot' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-icyHot
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-icyHot -> warmup1-icyHot
branch 'warmup1-icyHot' set up to track 'origin/warmup1-icyHot'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % add git in1020.java

zsh: command not found: add
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add in1020.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-in1020"
[warmup1-icyHot ccb102a] Add solution for warmup1-in1020
 1 file changed, 19 insertions(+)
 create mode 100644 in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-in1020
error: src refspec warmup1-in1020 does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-in1020

Switched to a new branch 'warmup1-in1020'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano In1020.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add in1020.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-in1020"
[warmup1-in1020 4818202] Add solution for warmup1-in1020
 1 file changed, 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-in1020
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 848 bytes | 848.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-in1020' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-in1020
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-in1020 -> warmup1-in1020
branch 'warmup1-in1020' set up to track 'origin/warmup1-in1020'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
fatal: pathspec 'hasTeen.java' did not match any files
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-hasTeen"
[warmup1-in1020 3f0b091] Add solution for warmup1-hasTeen
 1 file changed, 6 insertions(+)
 create mode 100644 hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-hasTeen
error: src refspec warmup1-hasTeen does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-hasTeen

Switched to a new branch 'warmup1-hasTeen'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano hasTeen.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add hasTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-hasTeen"
[warmup1-hasTeen c80dc76] Add solution for warmup1-hasTeen
 1 file changed, 14 insertions(+), 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-hasTeen
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 794 bytes | 794.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-hasTeen' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-hasTeen
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-hasTeen -> warmup1-hasTeen
branch 'warmup1-hasTeen' set up to track 'origin/warmup1-hasTeen'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano  loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
[warmup1-hasTeen dfd2045] Add solution for warmup1-loneTeen
 1 file changed, 5 insertions(+)
 create mode 100644 loneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-loneTeenn
error: src refspec warmup1-loneTeenn does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-loneTeen

Switched to a new branch 'warmup1-loneTeen'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano LoneTeen.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add LoneTeen.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
On branch warmup1-loneTeen
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   loneTeen.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add loneTeen.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-loneTeen"
[warmup1-loneTeen ce6e9e5] Add solution for warmup1-loneTeen
 1 file changed, 14 insertions(+), 4 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-loneTeen
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 817 bytes | 817.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-loneTeen' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-loneTeen
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-loneTeen -> warmup1-loneTeen
branch 'warmup1-loneTeen' set up to track 'origin/warmup1-loneTeen'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-delDel"  
[warmup1-loneTeen 64f4e26] Add solution for warmup1-delDel
 1 file changed, 7 insertions(+)
 create mode 100644 delDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 %  git push -u origin warmup1-delDel  
error: src refspec warmup1-delDel does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-delDel

Switched to a new branch 'warmup1-delDel'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano DelDel.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add DelDel.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-delDel"
On branch warmup1-delDel
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   delDel.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-delDel
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 411 bytes | 411.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-delDel' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-delDel
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-delDel -> warmup1-delDel
branch 'warmup1-delDel' set up to track 'origin/warmup1-delDel'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
[warmup1-delDel 9f56e78] Add solution for warmup1-mixStart
 1 file changed, 4 insertions(+)
 create mode 100644 mixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-mixStart
error: src refspec warmup1-mixStart does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-mixStart

Switched to a new branch 'warmup1-mixStart'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano MixStart.java

tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add MixStart.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
On branch warmup1-mixStart
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   delDel.java
	modified:   mixStart.java
	modified:   parrotTrouble.java

no changes added to commit (use "git add" and/or "git commit -a")
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add mixStart.java                           
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-mixStart"
[warmup1-mixStart 66842dc] Add solution for warmup1-mixStart
 1 file changed, 11 insertions(+), 2 deletions(-)
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-mixStart
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 747 bytes | 747.00 KiB/s, done.
Total 6 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), completed with 1 local object.
remote: 
remote: Create a pull request for 'warmup1-mixStart' on GitHub by visiting:
remote:      https://github.com/Tasneem201/Warmup-1sleepIn/pull/new/warmup1-mixStart
remote: 
To https://github.com/Tasneem201/Warmup-1sleepIn.git
 * [new branch]      warmup1-mixStart -> warmup1-mixStart
branch 'warmup1-mixStart' set up to track 'origin/warmup1-mixStart'.
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano startOz.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git add startOz.java   
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git commit -m "Add solution for warmup1-startOz" 
[warmup1-mixStart 557f8d5] Add solution for warmup1-startOz
 1 file changed, 12 insertions(+)
 create mode 100644 startOz.java
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git push -u origin warmup1-startOzt
error: src refspec warmup1-startOzt does not match any
error: failed to push some refs to 'https://github.com/Tasneem201/Warmup-1sleepIn.git'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % git checkout -b warmup1-startOz

Switched to a new branch 'warmup1-startOz'
tasneemibrahim@Tasneems-MacBook-Air warmup1 % nano StartOz.java


  UW PICO 5.09                                 File: StartOz.java                                 Modified  

public String startOz(String str) {
    String result = "";

    if (str.length() >= 1 && str                    
                      
     
                                                    
                      
     

                  
 



























^G Get Help       ^O WriteOut       ^R Read File      ^Y Prev Pg        ^K Cut Text       ^C Cur Pos        
^X Exit           ^J Justify        ^W Where is       ^V Next Pg        ^U UnCut Text     ^T To Spell      

