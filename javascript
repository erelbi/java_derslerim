<script>
$(document).ready(function(){
  $("#testuygundegil1").change(function(){
    document.getElementById('testuygun1').checked = false;
  });
  $("#testuygun1").change(function(){
    document.getElementById('testuygundegil1').checked = false;
  });
  $("#testuygundegil2").change(function(){
    document.getElementById('testuygun2').checked = false;
  });
  $("#testuygun2").change(function(){
    document.getElementById('testuygundegil2').checked = false;
  });  
  
  $("#testuygundegil3").change(function(){
    document.getElementById('testuygun3').checked = false;
  });
  $("#testuygun3").change(function(){
    document.getElementById('testuygundegil3').checked = false;
  });  
  
  $("#testuygundegil4").change(function(){
    document.getElementById('testuygun4').checked = false;
  });
  $("#testuygun4").change(function(){
    document.getElementById('testuygundegil4').checked = false;
  });

  $("#testuygun5").change(function(){
    document.getElementById('testuygundegil5').checked = false;
  });  $("#testuygundegil5").change(function(){
    document.getElementById('testuygun5').checked = false;
  });
  $("#testuygun5").change(function(){
    document.getElementById('testuygundegil5').checked = false;
  }); 
  
});


</script>
<script>
  $( "form" ).submit(function( event ) {
  console.log( $( this ).serializeArray() );
  event.preventDefault();
});
</script>
