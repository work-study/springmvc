<html>
<head>

</head>
<body>
    <a href="/hello.do">helloworld</a>

    <a href="/hello05?userName=zouwei&age=13">hello05</a>


    <form action="/addUser" method="Post">
        <input type="hidden" name="id" value="1"/>
        username: <input type="text" name="username" value="Tom"/>
        <br>
        email: <input type="text" name="email" value="tom@atguigu.com"/>
        <br>
        age: <input type="text" name="age" value="12"/>
        <br>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>
