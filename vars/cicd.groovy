def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'ab990aab-5e9f-4132-b630-667b91a98e2c', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
