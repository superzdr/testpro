function get(tag) {
    console.log(tag);
    console.log($(tag));
    console.log($(tag).children());
    $.each($(tag).children(),function (index,ele) {
        console.log(index);
        console.log(ele);
    })

    var objs =$.map($(tag).children(),function (ele) {
        return ele.innerText;
    });
    console.log(objs);

    console.log($("tr[id=tx] td:odd"));

    console.log($("#tx td[age=10]")[0]);
}

$(function () {
    $("#ddd").click(function () {
        alert($(this).text());
    });
})