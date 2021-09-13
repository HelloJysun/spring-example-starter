```
│  .gitignore
│  pom.xml
│
├─spring-starter
│  │  .gitignore
│  │  pom.xml
│  │
│  └─src
│    └─main
│        ├─java
│        │  └─com.example.starter
│        │          ExampleConfig.java                # configuration and enable configuration properties
│        │          ExampleProperties.java            # configuratin properties
│        │          SpringStarterApplication.java     # main method
│        │          User.java                         # bean
│        │
│        └─resources
│            │  application.yml
│            │
│            └─META-INF
│                    spring-configuration-metadata.json # spring configuration definition
│                    spring.factories                   # spring SPI definition
│  
└─spring-starter-test
    │  .gitignore
    │  pom.xml
    |
    └─src
      └─main
          ├─java
          │  └─com.example.test
          │          SpringStarterTestApplication.java # main method
          │
          └─resources
                  application.yml                      # define starter configuration attribute
    
```
