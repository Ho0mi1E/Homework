package OOPtask.task1incalss;

import OOPtask.task1incalss.Exception.IncorrectTypeException;

public class CardHolder {
    public Card getCard(String cardTypesStr) throws IncorrectTypeException {
        CardType cardType;
        try{
             cardType = CardType.valueOf(cardTypesStr);
        }catch (RuntimeException e){
            throw new IncorrectTypeException(cardTypesStr);
        }


        Card card;

        if (cardType.equals(CardType.CREDIT)){
            card = new CreditCard();
        }else {
            card = new DebitCard();
        }
        return card;
    }
}
