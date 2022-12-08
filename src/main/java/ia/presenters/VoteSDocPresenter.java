package ia.presenters;

import ia.exceptions.VoteSDocFailed;
import ia.gateways.ViewManagerGateway;
import ia.viewmodels.MainViewModel;
import uc.doc.voteonsolution.VoteSDocDsRequestModel;
import uc.doc.voteonsolution.VoteSDocOutputBoundary;
import uc.doc.voteonsolution.VoteSDocResponseModel;

public class VoteSDocPresenter implements VoteSDocOutputBoundary{

    private final ViewManagerGateway viewManagerGateway;
    private final MainViewModel viewModel;

    /**
     * Creates a presenter for updating the view
     * @param viewManagerGateway Used for managing and updating views
     */
    public VoteSDocPresenter(
            ViewManagerGateway viewManagerGateway, MainViewModel viewModel) {
        this.viewManagerGateway = viewManagerGateway;
        this.viewModel = viewModel;
    }

    /** Prepares SuccessView when a solution document is successfully voted
     *
     * @param model Response model containing the courseId, testId, solutionId and voteTotal
     * @return model Response model corresponding to successful
     */
    @Override
    public VoteSDocResponseModel prepareSuccessView(VoteSDocResponseModel model) {
        return model;
    }

    /** Prepares SuccessView when a solution document is unsuccessfully voted
     *
     * @param errorMessage The errorMessage that occurs when a failure view happens
     * @return response model from use case
     */
    @Override
    public VoteSDocDsRequestModel prepareFailureView(String errorMessage) {
        // TODO: prepare failure view
        viewManagerGateway.showError(errorMessage, "Document Vote Failed");
        throw new VoteSDocFailed(errorMessage);
    }
    
}
