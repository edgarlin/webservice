<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
<style>
.classRed {
	background-color: red;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<div id="dropbox">
			<label for="idFile">Choose a file</label>
			<button onclick="document.getElementById('idFile').click();">select
				files</button>
			<input type="file" id="idFile" name="nameFile" style="display:"
				multiple /> <label for="myName">Send me your name:</label> <input
				id="myName" name="name" value="John" />
		</div>
		<div>
			<button>post</button>
		</div>
	</form>
	<div>
		<button id='btnAjax'>ajax</button>
	</div>
	<div id="div1" width="100%" height="300"></div>
</body>
<script>
	$('#btnAjax').click(function() {
		var r = new FileReader();
		var lines;
		var msgWindow;
		var async = function(i, par) {
			$.ajax({
				url : "update",
				async : !(i % 100),
				data : par,
				success : function(result) {
					if (msgWindow) {
						msgWindow.document.write(i + '<BR/>');
					}
				}
			});
		};

		r.onload = function(event) {
			// 			console.log(event.target.result);
			lines = r.result.split(/\n/);
			msgWindow = window.open();
			for (var i = 0; i < lines.length; i++) {
				var line = lines[i];
				if (line) {
					//setTimeout(async(i,par), 10000 * i );
					async(i, {
						line : line,
						i : i
					});
				}
			}
		};
		r.readAsText($('#idFile').prop('files')[0]);
	});

	function dragIn(e) {
		//$(e.target).addClass('classRed');
		$('#dropbox').addClass('classRed');
		return false;
	}

	function dragOut(e) {
		//$(e.target).removeClass('classRed');
		$('#dropbox').addClass('classRed');
		return false;
	}

	function drop(e) {
		e.preventDefault();
		e.stopPropagation();
		$('#dropbox').removeClass('classRed');
		$('#idFile').prop('files', e.originalEvent.dataTransfer.files);
		// 		if (e.dataTransfer.items) {
		// 			for (var i = 0; i < e.dataTransfer.items.length; i++) {
		// 				if (e.dataTransfer.items[i].kind === 'file') {
		// 					var file = e.dataTransfer.items[i].getAsFile();
		// 					console.log('... file[' + i + '].name = ' + file.name);
		// 				}
		// 			}
		// 		} else {
		// 			for (var i = 0; i < e.dataTransfer.files.length; i++) {
		// 				console.log('... file[' + i + '].name = '
		// 						+ e.dataTransfer.files[i].name);
		// 				console.log(e.dataTransfer.files[i]);
		// 			}
		// 		}
		return false;
	}

	$('#dropbox').on('drag', dragIn).on('dragend', dragOut).on('dragenter',
			dragIn).on('dragexit', dragOut).on('dragleave', dragOut).on(
			'dragover', dragIn).on('dragstart', dragIn).on('drop', drop);
</script>
</html>

<!-- https://developer.mozilla.org/en-US/docs/Web/API/File/Using_files_from_web_applications -->
<!-- https://developer.mozilla.org/en-US/docs/Learn/HTML/Forms/Sending_forms_through_JavaScript -->
<!--  var lines = reader.result.split(/\n/); -->
<!--  var lines = reader.result; -->
<!-- reader.readAsText(document.getElementById('idFile').files[0]); -->