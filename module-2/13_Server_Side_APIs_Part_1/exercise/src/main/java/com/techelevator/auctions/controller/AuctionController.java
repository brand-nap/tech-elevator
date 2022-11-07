package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuctionController {

    private AuctionDao dao;
    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") Double currentBid_lte){
        if(title_like.equals("") && currentBid_lte == 0) {
            return dao.list();
        }else if(currentBid_lte == 0){
            return dao.searchByTitle(title_like);
        }else if(title_like.equals("")){
            return dao.searchByPrice(currentBid_lte);
        }else{
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction){
        return dao.create(auction);
    }


}
