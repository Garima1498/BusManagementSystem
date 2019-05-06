var rIndex,table = document.getElementById('table');

function chechEmptyInput(){
    var isEmpty = false;
    busNo = document.getElementById('busNo').value,
    pickUp = document.getElementById('pickUp').value,
    arrivalTime = document.getElementById('arrivalTime').value,
    dropPoint = document.getElementById('dropPoint').value,
    dropTime = document.getElementById('dropTime').value;

    if(busNo === ''){
        alert("Please Enter Bus Number");
        isEmpty = true;
    }

    else if(pickUp === ''){
        alert("Please Enter PickUp Point");
        isEmpty = true;
    }

    else if(arrivalTime === ''){
        alert("Please Enter Arrival Time");
        isEmpty = true;
    }

    else if(dropPoint === ''){
        alert("Please Enter Drop Point");
        isEmpty = true;
    }

    else if(dropTime === ''){
        alert("Please Enter Drop Time");
        isEmpty = true;
    }

    return isEmpty;
}

function addValue(){
    if(!chechEmptyInput()){
        var table = document.getElementById('table'),
        newRow = table.insertRow(table.length),
        cell1 = newRow.insertCell(0),
        cell2 = newRow.insertCell(1),
        cell3 = newRow.insertCell(2),
        cell4 = newRow.insertCell(3),
        cell5 = newRow.insertCell(4),

        busNo = document.getElementById('busNo').value,
        pickUp = document.getElementById('pickUp').value,
        arrivalTime = document.getElementById('arrivalTime').value,
        dropPoint = document.getElementById('dropPoint').value,
        dropTime = document.getElementById('dropTime').value;

        cell1.innerHTML = busNo;
        cell2.innerHTML = pickUp;
        cell3.innerHTML = arrivalTime;
        cell4.innerHTML = dropPoint;
        cell5.innerHTML = dropTime;

        selectRow();
    }
}

function selectRow(){
    
    for(var i = 1 ;i < table.rows.length;i++){
        table.rows[i].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('busNo').value = this.cells[0].innerHTML;
            document.getElementById('pickUp').value = this.cells[1].innerHTML;
            document.getElementById('arrivalTime').value = this.cells[2].innerHTML;
            document.getElementById('dropPoint').value = this.cells[3].innerHTML;
            document.getElementById('dropTime').value = this.cells[4].innerHTML;
        }
    }
}
selectRow();

function editVal(){
    var busNo = document.getElementById('busNo').value,
    pickUp = document.getElementById('pickUp').value,
    arrivalTime = document.getElementById('arrivalTime').value,
    dropPoint = document.getElementById('dropPoint').value,
    dropTime = document.getElementById('dropTime').value;
    table.rows[rIndex].cells[0].innerHTML = busNo;
    table.rows[rIndex].cells[1].innerHTML = pickUp;
    table.rows[rIndex].cells[2].innerHTML = arrivalTime;
    table.rows[rIndex].cells[3].innerHTML = dropPoint;
    table.rows[rIndex].cells[4].innerHTML = dropTime;
}

function removeSelected(){
    table.deleteRow(rIndex);

    busNo = document.getElementById('busNo').value = '',
    pickUp = document.getElementById('pickUp').value = '',
    arrivalTime = document.getElementById('arrivalTime').value = '',
    dropPoint = document.getElementById('dropPoint').value = '',
    dropTime = document.getElementById('dropTime').value = '';
}