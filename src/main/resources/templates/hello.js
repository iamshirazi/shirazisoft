$(document).ready(function() {
    $.ajax({
        url: "application/json"
    }).then(function(data) {
       $('.buddies-name').append(data.name);
       $('.buddies-phone').append(data.phone);
       $('.buddies-address').append(data.address);
    });
});