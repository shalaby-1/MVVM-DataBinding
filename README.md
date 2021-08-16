# MVVM-DataBinding  
uses data binding with MVVM architecture pattern  
- Data Binding inside activity file  
1- enable data binding inside gradle file inside android {}  
2- find xml file name using DataBindingUtil class  
3- data binding inside xml file will be the reverse of it is name inside xml file  
4- use it to access the id of a views using . operator  
- Data binding inside xml file replaces observing mutablelivedata inside activity  
1- convert layout to data binding   
2- create a new variable it is type is view model  
3- access view model mutablelivedata inside the text view  
4- assign view model variable to binding  
5- Specify the current activity as the lifecycle owner  
- Data binding inside xml file replaces setOnClickListener()  
1- add onClick attribute to the desired button  
2- @{() -> viewModel.methodName()}  
