Git 복사 하기 (https://github.com/goodexpert/JavaSample.git)
git clone https://github.com/goodexpert/JavaSample.git

#.gitignore 파일 생성 (저장소에 관리하지 않겠다고 선언된 파일들)
$ cd ~/workspace/JavaSample
$ vi .gitignore

# 현재 작업 상태 확인
$ git status

# 저장소 커밋 히스토리
$ git log

# 변경된 파일을 현재 브랜치에 하나씩 추가할 경우
$ git add .gitignore

# 변경된 모든 파일을 현재 브랜치에 추가할 경우
$ git add -A

# 변경된 내용을 저장소에 보관하며, 주석을 넣는다.
$ git commit -m "첫 커밋"

# 서버에 변경된 내용 푸쉬 하기
# origin의 주소는 .git/config 파일 안에 설정되어있다.
$ git push -u origin master

