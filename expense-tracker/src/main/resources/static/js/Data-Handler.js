$(document).ready(function () {
    console.log("Data-Handler Loaded");
    let tbody = $("#dataTable  tbody");
    tbody.empty();

    $.ajax({
        url: "data/userdata",
        method: "POST",
        success: function (data) {
            data.forEach(item => {

                    let tr = $("<tr></tr>");
                    tr.append($("<td></td>").text(item.id));
                    tr.append($("<td></td>").text(item.name));
                    tr.append($("<td></td>").text(item.amount));
                    tr.append($("<td></td>").text(item.date));
                    tr.append($("<td></td>").text(item.type));
                    tr.append($("<td></td>").text(item.PaymentMethod));
                    tr.append($("<td></td>").text(item.Category));
                    tr.append($("<td></td>").text(item.note));
                    tbody.append(tr);
                }
            )
            console.log(item.id + " : " + item.name + " : " + item.amount)
        }
    })



$("#filterBtn").on("click",function (){
    //Getting Values

    var date = new Date($("#datef").val());
    seldate = date.getDate();
    selmonth = date.getMonth();
    selyear = date.getFullYear();


    data ={
        name : $("#namef").val().trim(),
        amount: $("#amountf").val().trim(),
        amountType: $("#amountsel").val().trim(), //greater than, less than, equals
        finaldate : (seldate+"/"+selmonth+"/"+selyear).trim(),
        datetype : $("#datesel").val().trim(),
        typeslt : $("#typeselect").val().trim(), //income, expense
        method : $("#pmethodsel").val().trim()
    }
    jsondata = JSON.stringify(data,null,2);

    $.ajax({
        url: "data/sort",
        method: "POST",
        data: jsondata,



    })


    console.log("Name",name," \n Amount:",amount, "\n Amount type:",amounttype,"\nDate:",finaldate,"\nDate Type:",datetype,"\nType:",typeslt, "\nPayment Method: ",method )
})

})

