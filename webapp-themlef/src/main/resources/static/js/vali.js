$(function(){
    var pojo={
        id:null,
        name:"",
        age:101,
        address:"老子名字的字符串长度在5-20"
    };
    $.ajax({
        type: 'POST',
        url:'./validate',
        data:JSON.stringify(pojo),
        success: function(result){
        console.log(result);
    },
        dataType:'json',
        contentType:'application/json'
    });
})