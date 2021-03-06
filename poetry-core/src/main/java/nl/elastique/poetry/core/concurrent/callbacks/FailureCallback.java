package nl.elastique.poetry.core.concurrent.callbacks;

import nl.elastique.poetry.core.concurrent.Callback;

/**
 * A Callback where you can only define onFailure.
 */
abstract  public class FailureCallback<Type> implements Callback<Type>
{
    @Override
    final public void onSuccess(Type type)
    {
    }
}
