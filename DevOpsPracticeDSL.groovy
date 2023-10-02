Job('DevOpsPractice-Via-DSL'){
	Description("This the my first devops project generated by DSL on ${new Date()}.")
	scm{
		git("https://github.com/sandipkrray1/DevOpsPractice.git", main)
	}
	triggers{
		scm('* * * * *')
	}
	steps{
		maven('clean package', 'pom.xml')
	}
	publishers{
		archiveArtifacts '**/*.jar'
	}
}
