function initMap() {
    	  const myLatLng = { lat: latitude, lng: longitude };
    	  const map = new google.maps.Map(document.getElementById("map"), {
    	    zoom: 8,
    	    center: myLatLng,
    	  });
    	  new google.maps.Marker({
    	    position: myLatLng,
    	    map,
    	    title: "My Fishing Spot", //add the name of the fishing spot
    	  });
    	}