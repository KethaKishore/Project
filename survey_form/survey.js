function resetForm() {
    document.getElementById('survey-form').reset();
}

function submitForm() {
    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const dateOfBirth = document.getElementById('date-of-birth').value;
    const country = document.getElementById('country').value;
    const gender = (document.getElementById('male').checked ? 'Male' : '') + (document.getElementById('female').checked ? ' Female' : '');
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobileNumber = document.getElementById('mobile-number').value;

    document.getElementById('popup-first-name').textContent = firstName;
    document.getElementById('popup-last-name').textContent = lastName;
    document.getElementById('popup-date-of-birth').textContent = dateOfBirth;
    document.getElementById('popup-country').textContent = country;
    document.getElementById('popup-gender').textContent = gender;
    document.getElementById('popup-profession').textContent = profession;
    document.getElementById('popup-email').textContent = email;
    document.getElementById('popup-mobile-number').textContent = mobileNumber;
    document.getElementById('popup').style.display = 'block';
}
function closePopup() {
    document.getElementById('popup').style.display = 'none';
    document.getElementById('survey-form').reset();
}
