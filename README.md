# tika-kids-translate

## Building this project

In order to build this project for use in Alice you'll need to do 2 things

1.  Edit the src/main/resources/org/apache/tika/language/translate/translator.microsoft.properties to add your Translate API client id and client secret.
2.  Build the jar using the maven command
```
clean install shade:shade
```

Then in order to use this project there is a single class and method

```
        Translator translator = new Translator();
        System.out.println(translator.translate("Good Morning", Language.GERMAN.toString()));
```