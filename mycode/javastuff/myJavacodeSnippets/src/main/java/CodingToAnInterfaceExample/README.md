This example demonstrates the following points:

    a)  How to write an interface class
    b)  How to use an interface class & implement is
    c)  What is the purpose of having an interface when we could
        have written a simple class in lieu of it.
    d)  What are the advantages of coding to an interface over
        coding directly to a class.
        
## Example Scenario

For this example, we consider the following scenario:

We want to process certain files and there is a specific flow of doing it.
We load the list of files and process them based on their extension.

Tasks to do:

    a)  Write an inerface class which will cover the following methods:
            Let's say interface file is FileProcessor:
                Methods available should be:
                    String getFilename ()
                    void setFilename (String filename)
                    int processing_logic (void) throws
                    
    b)  Write implemententations of the above inerfaces let's say for JSON & XML files.                    
        Now the thing is that we want to process JSON files and load them into hash map.
        For XML files, we want to not load them but just print its contents on the STDOUT. 
        Let's say JSON implementation is called: JSONFileProcessor, and the XML one is called
        XMLFileProcessor. You are free to choose any name(s).
       
    c)  Main class will use the Interface everywhere and we will instantiate implementation
        object at runtime, basis the file name extension. Main logic is very simple - it is
        given a directory and it reads the list of files (present in the given directory) &
        processes them.
        
        Comparision between Old Implementation & new Implementation
        
        
        Old Implementation
        
        //1. MainLogic for Processing JSON & XML were in Same Class File.
        1. Main processing logic was present in a single class.
        
        //2. We have implemented the Interface but We didn't used it properly.
        2.  We didn't take advantage of the provided inerface. Despite the interface being
            present, we were still using monolithic approach i.e. coding everything at
            a single place. Moreover, we didn't even use the interface methods like
            'String getFilename()' & 'void setfilename (String)'
                 
        //3. The methods String getFilename () & void setFilename (String filename) were not used as Compared to  New Implementation.
        
        //4. If we want to process another type of file then everytime we need to change the main logic of class.
        4.  The above described approch would force us to change the main logic each time we would like to incorporate
            a new feature/extension etc. In general this is not desirable and it is against the pricinples of good
            software design.
        
        
        //  THE POINT IS VERY ABSTRACT. IT IS REQUIRED TO BE EXPLAINED.
        //  ONLY ONE LINERS DO NOT HELP ANYONE TO UNDERSTAND ANYTHING.
        //5. Data abstraction was not used in this implementation.
        
          
        
        New Implementation 
        
        //  'main logic of processing' OR 'main processing logic' ???
        1.  for the main processing logic JSON & XML File 
            we have implemented Separate class File (i.e. JSONFilePocessor & XMLFileProcessor ).
            Both the classes implments the interface (FileProcessor).
        1.  We coded our main logic to the interface class and not to any particular implementation.
            Our main logic was bonded to interface ONLY. Since inheritance allows us to use BASE
            class object in place of derived class object - we took advantage of this property
            and replaced all requirement of Derived class objects, by BASE class objects, through
            out the main program.            
            
        2.  We used 2 interfaces 
                i.  FileProcessor - It Contains Abstract Methods String getFileName (),void setFileName(String FileName),
                                    and void processing_logic().The JSONFileProcessor & XMLFileProcessor class files 
                                    implements this interface.This class files contains the method bodies which is declared 
                                    in this interface.
                                    
                                    1.String getFileName() : Initially We declared an String filename with null value.Since this method
                                    has no return type we will return the value of filename in the body of the method.Further we 
                                    will use the filename.
                                    
                                    2.void setFilename(string Filename) : This method takes Filename as parameter.In this Method body 
                                    we have set value of FileName  by filename.This will help to get the filename from the user.
                                    
                                    3.void processing_logic(). : This method will perform the operations on the particular file that the 
                                                                 user will input. 
                                  
                ii. FileProcessObjectSelector -In this Interface, we have declared the method SelectObjectBasedOnFilename.This 
                                               method uses return type as interface FileProcessor and parameter as filename. 
                                               By using return type as FileProcessor, we can return any of the class as object which ever class 
                                               implements that interface.It will help us to process the files according to the 
                                               file type.If the file type is .xml then it will return XMLFileProcessor(); 
                                               as object and if it is .json then it will return JSONFileProcessor().
                                                
                                                
                                                
            
        3.  The MainFileProcessor class Contains the Main class of our application in which it takes input from user.Then we created directory
            object of the input.Similarly,We created object for FileProcessObjectSelectorImp1. We have also declared an fp variable as null
             with return type FileProcessor Which will help us to call the methods from the base class.Then we iterated over the directory on each file .
            
         
        4.  In new implementation, If there is requirement of adding a new feature to the software or application . 
            We just need to implement new class file and then bound it to the interface.As the Main logic remains the same.
            We are just adding new feature to the application.
