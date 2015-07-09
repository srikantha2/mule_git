To test the Mule application, run the following URLs in the browser window:

http://localhost:8092/jersey/schools/1
http://localhost:8092/jersey/schools/2/children
http://localhost:8092/jersey/schools/112
http://localhost:8092/jersey/schools/1/children?childid=3

The output generated in the browser window for
http://localhost:8092/jersey/schools/1
is shown below:
<Schools>
    <School>
        <Id>1</Id>
        <Name>Father Agnel's school</Name>
        <Rating>3.5</Rating>
    </School>
</Schools>
The output generated in the browser window for

http://localhost:8092/jersey/schools/2/children
is shown below:

<Schools>
    <School>
        <Id>2</Id>
        <Name>Gurukul school</Name>
        <Rating>3.0</Rating>
        <Children>
            <Name>Star1</Name>
            <Name>Star2</Name>
            <Name>Star3</Name>
        </Children>
    </School>
</Schools>

The output generated in the browser window for
http://localhost:8092/jersey/schools/112
is shown below:
<Schools>
    <Error>School not found!</Error>
</Schools>

The output generated in the browser window for
http://localhost:8092/jersey/schools/1/children?childid=3
is shown below:
<Schools>
    <School>
        <Id>1</Id>
        <Name>Father Agnel's school</Name>
        <Rating>3.5</Rating>
        <Children>
            <Error>No children associated with this school</Error>
        </Children>
    </School>
</Schools>
