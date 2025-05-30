function cardValidation(issuer, numberCard) {
  const cardCheck = {
    MasterCard: 16;
    Discover: 16;
    Visa: 16;
    AmericanExpress: 15;
  };
  const checklen = cardCheck[issuer];
  if(numberCard.length === checklen) {
    return { valid: true, message: issuer };
  }
  return { valid: false, message: Invalid Length for ${issuer} };
}

function validateAtmCard(numberCard) {
  if (!Array.isArray(numberCard) || numberCard.length === 0) {
    return { valid: false, message: "Invalid card number" };
  }

  const firstDigit = numberCard[0];

  switch (firstDigit) {
    case 4:
      return cardValidation("Visa", numberCard);
    case 5:
      return cardValidation("MasterCard", numberCard);
    case 6:
      return cardValidation("Discover", numberCard);
    case 3:
      return cardValidation("AmericanExpress", numberCard);
    default:
      return { valid: false, message: "Unknown card issuer" };
  }
}
console.log(validateAtmCard([4,9,7,5,4,0,8,9,2,7,8,5,6,2,4,5,4]));
