function changeTheme() {
    if (document.getElementById('button').innerHTML === 'Dark Theme') {
        document.body.style.background = '#555';
        document.body.style.color = 'white';
        document.getElementById('button').innerHTML = 'Light Theme';
    }
    else {
        document.body.style.background = 'white';
        document.body.style.color = '#555';
        document.getElementById('button').innerHTML = 'Dark Theme';
    }
}