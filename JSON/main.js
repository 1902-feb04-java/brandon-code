document.addEventListener('DOMContentLoaded', (e) => {
    e.preventDefault();
    document.getElementById('button').addEventListener('click', ()=>{
        let textArea = document.getElementById('textArea');
        let json = JSON.parse(textArea.value)
        console.log(json);
        json.name = "Toby";
        console.log(json);
        textArea.value = JSON.stringify(json);

    })
})