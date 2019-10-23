# TechniumBoard

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.3.8.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

#proxy

npm config set https-proxy http://patel512:zzaawe_236@ccaintra.kpnnl.local:8080
npm config set https-proxy http://patel512:zzaawe_236@ccaintra.kpnnl.local:8080                                                   

#Node JS 

node -v
v12.11.1

#Angular CLI
npm install -g @angular/cli

# To install latest release and update package.json 
npm install angular-material --save

npm -v
6.11.3

#Angular CLI
ng --version
Angular CLI: 8.3.8
Package                      Version
------------------------------------------------------
@angular-devkit/architect    0.803.8
@angular-devkit/core         8.3.8
@angular-devkit/schematics   8.3.8
@schematics/angular          8.3.8
@schematics/update           0.803.8
rxjs                         6.4.0


#Create

ng new projectname

--Create class
ng generate class user
--Create service 
ng generate service user-service
--Create component
ng generate component user-list

ng g c components/dashboard


#Run

ng serve --open

#GIT 
 git init
$ git add *.c
$ git add LICENSE
$ git commit -m 'initial project version'

git clone https://github.com/libgit2/libgit2 mylibgit


https://gist.github.com/evantoli/f8c23a37eb3558ab8765

=====Tutorials points
--> reactive Single Page Applications (SPA)

Angular 7 App files which are mainly used in your project are given below:

src folder: This is the folder which contains the main code files related to your angular application.
app folder: The app folder contains the files, you have created for app components.
app.component.css: This file contains the cascading style sheets code for your app component.
app.component.html: This file contains the html file related to app component. This is the template file which is used by angular to do the data binding.
app.component.spec.ts: This file is a unit testing file related to app component. This file is used along with other unit tests. It is run from Angular CLI by the command ng test.
app.component.ts: This is the most important typescript file which includes the view logic behind the component.
app.module.ts: This is also a typescript file which includes all the dependencies for the website. This file is used to define the needed modules to be imported, the components to be declared and the main component to be bootstrapped.

#Other Important files

package.json: This is npm configuration file. It includes details about your website's package dependencies along with details about your own website being a package itself.
package-lock.json : This is an auto-generated and modified file that gets updated whenever npm does an operation related to node_modules or package.json
angular.json: It is very important configuration file related to your angular application. It defines the structure of your app and includes any settings associated with your application. Here, you can specify environments on this file (development, production). This is the file where we add Bootstrap file to work with Angular 7.
.gitignore: This file is related to the source control git.
.editorconfig: This is a simple file which is used to maintain consistency in code editors to organize some basics such as indentation and whitespaces.
assets folder: This folder is a placeholder for resource files which are used in the application such as images, locales, translations etc.
environments folder: The environments folder is used to hold the environment configuration constants that help when building the angular application. The constants are defined in 2 separate .ts files (environment.ts and environment.prod.ts), where these constants are used within the angular.json file by the Angular CLI. For example, if you run the ng build command, it will build the application using the development environment settings, whereas the command ng build ?prod will build the project using the production environment settings.
browserlist: This file is used by autoprefixer that adjusts the CSS to support a list of defined browsers.
favicon.ico: This file specifies a small icon that appears next to the browser tab of a website.
index.html: This is the entry file which holds the high level container for the angular application.
karma.config.js: This file specifies the config file for the Karma Test Runner, Karma has been developed by the AngularJS team which can run tests for both AngularJS and Angular 2+
main.ts: As defined in angular.json file, this is the main ts file that will first run. This file bootstraps (starts) the AppModule from app.module.ts , and it can be used to define global configurations.
polyfills.ts: This file is a set of code that can be used to provide compatibility support for older browsers. Angular 7 code is written mainly in ES6+ language specifications which is getting more adopted in front-end development, so since not all browsers support the full ES6+ specifications, pollyfills can be used to cover whatever feature missing from a given browser.
styles.css:/ This is a global css file which is used by the angular application.
tests.ts: This is the main test file that the Angular CLI command ng test will use to traverse all the unit tests within the application and run them.
tsconfig.json: This is a typescript compiler configuration file.
tsconfig.app.json: This is used to override the tsconfig.json file with app specific configurations.
tsconfig.spec.json: This overrides the tsconfig.json file with app specific unit test configurations.


#Install bootstrap

npm install --save bootstrap@3  => The @3  is important!  













