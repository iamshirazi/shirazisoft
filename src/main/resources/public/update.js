function addItem() {
    var ordlist = document.getElementById('destination');
    var name = document.getElementById('name');
    var phone = document.getElementById('phone');
    var address = document.getElementById('address');
    var li = document.createElement('li');
    li.setAttribute('name', '${buddies.name}');
    li.setAttribute('phone', '${buddies.phone}');
    li.setAttribute('address', '${buddies.address}');
    li.appendChild(document.createTextNode(name.value + ", "));
    li.appendChild(document.createTextNode(phone.value + ", "));
    li.appendChild(document.createTextNode(address.value));
    ordlist.appendChild(li);
    //th:text="'Name: ' + ${buddies.name}" + " " + th:text="'Phone number: ' + ${buddies.phone}" + " " + th:text="'Address: ' + ${buddies.address}"
}

$(function(){
    $('a[href$="/buddies"]').each(function(){
        this.href = this.href.replace(/\/delete$/, "");
        $(this).attr("data-method", "buddies").attr("data-confrim", "Are you sure?");
    });
})
